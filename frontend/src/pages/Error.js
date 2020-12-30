import React from 'react';
import { Link } from 'react-router-dom';

const Error = () => {
  return (
    <div>
      <h1>Error Page</h1>
      <Link to='/'>Back to landing page</Link>
    </div>
  );
};

export default Error;
