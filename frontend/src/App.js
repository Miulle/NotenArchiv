import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
// pages
import TableInstrumente from './pages/TableInstrumente';
import AddInstrument from './Components/AddInstrument';
import TableKomponisten from './pages/TableKomponisten';
import AddKomponist from './Components/AddKomponist';
import TableKonzerte from './pages/TableKonzerte';
import AddKonzert from './Components/AddKonzert';
import TableWerke from './pages/TableWerke';
import Home from 'pages/Home';
import Error from './pages/Error';
// Navbar
import Navbar from './Components/Navbar';

const App = () => {
  return (
    <Router>
      <Navbar />
      <Switch>
        <Route exact path='/'>
          <Home />
        </Route>
        <Route path='/testPage'>
          <testPage />
        </Route>
        <Route path='/instrumente'>
          <TableInstrumente />
        </Route>
        <Route path='/addinstrument'>
          <AddInstrument />
        </Route>
        <Route path='/komponisten'>
          <TableKomponisten />
        </Route>
        <Route path='/addkomponist'>
          <AddKomponist />
        </Route>
        <Route path='/werke'>
          <TableWerke />
        </Route>
        <Route path='/konzerte'>
          <TableKonzerte />
        </Route>
        <Route path='/addkonzert'>
          <AddKonzert />
        </Route>
        <Route path='*'>
          <Error />
        </Route>
      </Switch>
    </Router>
  );
};

export default App;
