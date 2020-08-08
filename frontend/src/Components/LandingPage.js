import React from "react";
import {makeStyles} from "@material-ui/core/styles";
import CssBaseline from "@material-ui/core/CssBaseline";
import Typography from "@material-ui/core/Typography";
import Grid from "@material-ui/core/Grid";
import {Link} from "react-router-dom";
import Container from "@material-ui/core/Container";
import GroupIcon from "@material-ui/icons/Group";
import Avatar from "@material-ui/core/Avatar";

const useStyles = makeStyles(theme => ({
    paper: {
        marginTop: theme.spacing(7),
        display: "flex",
        flexDirection: "column",
        alignItems: "center"
    },
    form: {
        width: "100%",
        marginTop: theme.spacing(3)
    }
}));

const Header = () => (
    <div style={{marginTop: "10px"}}>
        <Link to="/">Go to about</Link>
    </div>
);

const Footer = () => (
    <div style={{marginTop: "10px"}}>
        <Link to="/">Go to about</Link>
    </div>

);

export default function LandingPage() {
    const classes = useStyles();
    const [firstLoad, setLoad] = React.useState(true);

    if (firstLoad) {
        setLoad(false);
    }

    return (
        <Container component="main" maxWidth="xs">
            <CssBaseline />
            <Header>Header |</Header>
            <div className={classes.paper}>

                <Avatar className={classes.avatar}>
                    <GroupIcon scale=""/>
                </Avatar>
                <Typography component="h1" variant="h5">
                    Welcome to the landing page
                </Typography>
                <form className={classes.form} noValidate>
                    <Grid container justify="center" spacing="7">
                        <Grid item>
                            <Link to="/werk">View Werke Records</Link>
                        </Grid>
                        <Grid item>
                            <Link to="/">Dummy</Link>
                        </Grid>
                    </Grid>
                   <Grid container justify="center" spacing="7">
                        <Grid item>
                            <Link to="/instrument">View Instrument Records</Link>
                        </Grid>
                        <Grid item>
                           <Link to="/addinstrument">Add Instrument</Link>
                       </Grid>
                    </Grid>
                    <Grid container justify="center" spacing="7">
                        <Grid item>
                            <Link to="/komponist">View Komponist Records</Link>
                        </Grid>
                        <Grid item>
                            <Link to="/addkomponist">Add Komponist</Link>
                        </Grid>
                    </Grid>
                    <Grid container justify="center" spacing="7">
                        <Grid item>
                            <Link to="/konzert">View Konzert Records</Link>
                        </Grid>
                        <Grid item>
                            <Link to="/addkonzert">Add Konzert</Link>
                        </Grid>
                    </Grid>
                    <Grid container justify="center" spacing="7">
                        <Grid item>
                            <Link to="/emp">View Employee Records</Link>
                        </Grid>
                        <Grid item>
                            <Link to="/addemp">add Employee</Link>
                        </Grid>
                    </Grid>
                    {/*<Grid container justify="center" spacing="7">*/}
                    {/*    <Grid item>*/}
                    {/*        <Link to="/testPage">Go to testPage</Link>*/}
                    {/*    </Grid>*/}
                    {/*</Grid>*/}
                </form>
            </div>
            <Footer />
        </Container>
    );
}