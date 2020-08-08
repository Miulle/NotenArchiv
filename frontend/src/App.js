import React, { Component } from "react";
import AddEmployee from "./Components/AddEmployee";
import { Route, Switch, BrowserRouter as Router } from "react-router-dom";
import TableEmpployee from "./Components/TableEmployee";
import LandingPage from "./Components/LandingPage";
import TableInstrument from "./Components/TableInstrument";
import TableKomponist from "./Components/TableKomponist";
import TableWerk from "./Components/TableWerk";
import TableKonzert from "./Components/TableKonzert";
import testPage from "./pages/testPage"
import AddKomponist from "./Components/AddKomponist";
import AddInstrument from "./Components/AddInstrument";
import AddKonzert from "./Components/AddKonzert";

class App extends Component {
    render() {
        return (
            <div>
                <Router>
                    <div>
                        <Switch>
                            <Route exact path="/testPage" component={testPage} />
                            <Route exact path="/" component={LandingPage} />
                            <Route exact path="/addemp" component={AddEmployee} />
                            <Route exact path="/emp" component={TableEmpployee} />
                            <Route exact path="/instrument" component={TableInstrument} />
                            <Route exact path="/addinstrument" component={AddInstrument} />
                            <Route exact path="/komponist" component={TableKomponist} />
                            <Route exact path="/addkomponist" component={AddKomponist} />
                            <Route exact path="/werk" component={TableWerk} />
                            <Route exact path="/konzert" component={TableKonzert} />
                            <Route exact path="/addkonzert" component={AddKonzert} />
                        </Switch>
                    </div>
                </Router>
            </div>
       );
    }
}

export default App;