document.addEventListener('DOMContentLoaded', function () {
    const chistesContainer = document.getElementById('chistes-body')
    const chisteForm = document.getElementById('chiste-form')

    // Función para cargar todos los chistes
    function cargarChistes() {
        fetch('/chistes')
            .then(response => response.json())
            .then(data => {
                chistesContainer.innerHTML = ''
                data.forEach(chiste => {
                    const tr = document.createElement('tr')
                    tr.innerHTML = `
                        <td>${chiste.id}</td>
                        <td>${chiste.texto}</td>
                        <td>${chiste.autor}</td>
                        <td><button class="eliminar" data-id="${chiste.id}">Eliminar</button></td>
                    `
                    chistesContainer.appendChild(tr)
                })

                // Agregar event listener para los botones de eliminar
                document.querySelectorAll('.eliminar').forEach(button => {
                    button.addEventListener('click', function () {
                        const chisteId = this.getAttribute('data-id')
                        eliminarChiste(chisteId)
                    })
                })
            })
    }

    // Función para agregar un nuevo chiste
    chisteForm.addEventListener('submit', function (event) {
        event.preventDefault()
        const id = parseInt(document.getElementById('chiste-id').value)
        const texto = document.getElementById('chiste-texto').value
        const autor = document.getElementById('chiste-autor').value

        const nuevoChiste = {
            id: id,
            texto: texto,
            autor: autor
        }

        fetch('/chistes', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(nuevoChiste)
        })
        .then(() => {
            cargarChistes()
            chisteForm.reset()
        })
    })

    // Función para eliminar un chiste
    function eliminarChiste(id) {
        fetch(`/chistes/${id}`, {
            method: 'DELETE'
        })
        .then(() => cargarChistes())
    }

    // Cargar los chistes al cargar la página
    cargarChistes()
})

