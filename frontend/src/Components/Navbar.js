import React, { useState, useRef, useEffect } from 'react';
import { FaBars } from 'react-icons/fa';
import logo from '../assets/logo/SOF_Logo.svg';

import { Link } from 'react-router-dom';
import { links } from './Navbardata';
import './Navbar.css';

const Navbar = () => {
  const [showLinks, setShowLinks] = useState(false);
  const linksContainerRef = useRef(null);
  const linksRef = useRef(null);

  useEffect(() => {
    const linksHeight = linksRef.current.getBoundingClientRect().height;
    if (showLinks) {
      linksContainerRef.current.style.height = `${linksHeight}px`;
      console.log(linksHeight);
    } else {
      linksContainerRef.current.style.height = '0px';
    }
  }, [showLinks]);

  return (
    <nav>
      <div className='nav-center'>
        <div className='nav-header'>
          <a href='http://www.sinfonieorchester-friedrichshafen.de/'>
            <img src={logo} alt='logo' />
          </a>

          <button
            className='nav-toggle'
            onClick={() => setShowLinks(!showLinks)}
          >
            <FaBars />
          </button>
        </div>
        <div className='links-container' ref={linksContainerRef}>
          <ul className='links' ref={linksRef}>
            {links.map((link) => {
              const { id, url, name } = link;
              return (
                <li key={id}>
                  <Link className='link-element' to={url}>
                    {name}
                  </Link>
                </li>
              );
            })}
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
