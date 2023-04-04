import React from 'react'

export const SegundoComponente = ({nombre, apellido, Info}) => {
  return (
    <div>
      <h1>SegundoComponente</h1>
      <li>{nombre} {} {apellido}</li>
      <li>{Info.Lugar}</li>
      <li>{Info.Gustos}</li>
    </div>
  )
}

