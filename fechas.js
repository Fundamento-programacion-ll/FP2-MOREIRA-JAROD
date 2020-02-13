/*
-crear un nuevo elemento funcion (Nombre,apellido,edad)
-que se encuentre me imprima pero si no cree un elemento funcion
-elimine cualquiera funcion(Nombre,apellido,edad)
*/

var fecha = [{
    nombre: 'Sam',
    apellido: 'moreira',
    edad: 21
}, {
    nombre: 'pepe',
    apellido: 'moni',
    edad: 25
}, {
    nombre: 'nicol',
    apellido: 'mayo',
    edad: 22
}, {
    nombre: 'mario',
    apellido: 'ocoto',
    edad: 27
}];
var buscarusuario = (fecha, usuariobuscar) => {
    var usuarioencontrado = fecha.find((usuario) => {

        return usuario.nombre === usuariobuscar;
    });
    console.log(usuarioencontrado);
};
buscarusuario(fecha, ('Sam'));
//agregar usuario

var nuevousuario = (fecha, nomb, apell, eda) => {
    var nuevo = {
        nombre: nomb,
        apellido: apell,
        edad: eda
    }
    return fecha.push(nuevo);
};
nuevousuario(fecha, "Sam", "moreira ", (27));


//buscar usuario
var buscarusuarion = (fecha, usuariobuscar) => {
    var usuarioencontrado = fecha.find((usuario) => {

        return usuario.nombre === usuariobuscar;
    });
    
    if (usuarioencontrado === undefined) {
        nuevousuario(fecha, (usuariobuscar), ("nuevo"), (30));

    } else {
        console.log(usuarioencontrado);
    }

};
buscarusuarion(fecha, ('otro'));
console.log(fecha);
//eliminar usuario

var eliminarusuario = ((fecha, u) => {
    var usuarioencontrado = fecha.find((usuario) => {
        return usuario.nombre !== u;
    });
    console.log(usuarioencontrado);
});

console.log(fecha)