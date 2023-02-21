class Persona{

    constructor (nombre, apellido){
        this._nombre = nombre;
        this.apellido = apellido;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get nombre(){
        return this._nombre
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    get apellido(){
        return this._apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
    //Sobreescribir el metodo de la clase padre object
    toString(){
        return this.nombreCompleto();
    }
}
class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre,apellido)
        this._departamento = departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+ ' ' + this._departamento;
    }
}

let persona1 = new Persona('Arturo', 'Chavez');
console.log(persona1.toString());

let empleado1 = new Empleado('Maria', 'Peres', 'Alonso');
console.log(empleado1);
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());

/*
let persona3 = new persona('Guaty', 'El chido');
persona3.nombre = ' El guaty' 
persona3.apellido = 'El chido2';
console.log(persona3.nombre);
console.log(persona3.apellido)

let persona1 = new persona('Daniel', 'Guzman');
console.log(persona1.nombre);
console.log(persona1.apellido);

let persona2 = new persona('Alonso', 'Hernandez');
console.log(persona2);
*/