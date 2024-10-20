import React from "react";
import { BrowserRouter as Router, Route, Routes, Link } from "react-router-dom";
import Home from "./Home.js";
import SignInSignUp from "./SignUpSIgnIn.js";
import './App.css';
{/*import About from "./About";
import Login from "./Login";*/}


function App() {
  return (
    <Router>
      <div>
        <nav>
          <ul className="nav-links">
            <li><Link to="/">Home</Link></li>
            <li><Link to="/about">About</Link></li>
            <li><Link to="/login">Login</Link></li>
            <li><Link to="/signup">Sign Up</Link></li>  {/* Add Sign Up link */}
            <li><a href="https://www.govisland.com/map" target="_blank" rel="noopener noreferrer">Map</a></li>
          </ul>
        </nav>

        <Routes>
         <Route path="/" element={<Home />} />
          {/*<route path="/about" element={<about />} />
          <route path="/login" element={<login />} /> */}
         <Route path="/signup" element={<SignInSignUp />} />

        </Routes>
      </div>
    </Router>
  );
}

export default App;
