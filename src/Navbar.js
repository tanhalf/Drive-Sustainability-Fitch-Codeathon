import React from 'react';
import './App.css';

function Navbar() {
  return (
    <nav className="navbar">
      <ul>
        <li><a href="#about">ABOUT</a></li>
        <li><a href="#map">MAP</a></li>
        <li><a href="#login">LOGIN</a></li>
        <li><a href="#signup">SIGN UP</a></li>
      </ul>
    </nav>
  );
}

export default Navbar;
