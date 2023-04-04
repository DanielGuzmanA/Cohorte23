import logo from './logo.svg';
import './App.css';
import PrimerComponente from './misComponentes/PrimerComponente';
import { SegundoComponente } from './misComponentes/SegundoComponente';
import TercerComponente from './misComponentes/TercerComponente';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Contacto from './misComponentes/Contacto';

function App() {
  const datos ={Lugar: "Guadalajara", Gustos: "GOLF 2002"}
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <BrowserRouter>
        <Routes>
        <Route path="/" element={<div>Hola</div>}/>
        <Route path="/msj" element={<div>Generetion</div>}/>
        <Route path="/Contacto" element={<Contacto/>}/>
        </Routes>
        </BrowserRouter>
        <p>
          Hola Mundo... !!
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <h1>Cohorte 23</h1>
        <div className="Componentes">
        <hr />
        <TercerComponente/>
        <hr />
        <SegundoComponente nombre="Daniel" apellido="Guzman"
        Info = {datos}/>
        <hr />
          <PrimerComponente/>
        </div>
      </header>
    </div>
  );
}

export default App;
