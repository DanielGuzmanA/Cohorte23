// Prueba efectiva
//const indexTest = require ("../Calculadora");

import { indexTest } from "../Calculadora";

test('test suma', () => {
    const r = indexTest.sumar(1,2);
    expect (r).toBe(3);
});

test.todo('test resta');
test.todo('test multiplicacion');
test.todo('test division');