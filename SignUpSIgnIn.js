import React, { useState } from "react";
import './SignInSignUp.css';

function SignInSignUp() {
  const [isSignIn, setIsSignIn] = useState(true);

  const togglePage = () => {
    setIsSignIn(!isSignIn);
  };

  return (
    <div className="auth-container">
      {isSignIn ? (
        <div className="auth-box">
          <h2>Sign In</h2>
          <form>
            <label>Email</label>
            <input type="email" placeholder="Enter your email" />
            <label>Password</label>
            <input type="password" placeholder="Enter your password" />
            <button type="submit">Sign In</button>
          </form>
          <p className="toggle-text">
            New Here? <span className="toggle-link" onClick={togglePage}>Sign Up here</span>
          </p>
        </div>
      ) : (
        <div className="auth-box">
          <h2>Sign Up</h2>
          <form>
            <label>Email</label>
            <input type="email" placeholder="Enter your email" />
            <label>Password</label>
            <input type="password" placeholder="Enter your password" />
            <button type="submit">Sign Up</button>
          </form>
          <p className="toggle-text">
            Already have an account? <span className="toggle-link" onClick={togglePage}>Sign In</span>
          </p>
        </div>
      )}
    </div>
  );
}

export default SignInSignUp;
