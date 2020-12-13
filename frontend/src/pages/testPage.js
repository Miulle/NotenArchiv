import React, { Component } from "react";
import CssBaseline from "@material-ui/core/CssBaseline";
import Avatar from "@material-ui/core/Avatar";
import GroupIcon from "@material-ui/icons/Group";
import Typography from "@material-ui/core/Typography";
import Grid from "@material-ui/core/Grid";
import {Link} from "react-router-dom";
import Container from "@material-ui/core/Container";
import { withStyles } from "@material-ui/core/styles";

const useStyles = theme => ({
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
});

class testPage extends Component {
    render() {
        const { classes } = this.props;
        return (
            <Container component="main" maxWidth="xs">
                <CssBaseline />
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
                                <Link to="/">Dummy</Link>
                            </Grid>
                        </Grid>
                        <Grid container justify="center" spacing="7">
                            <Grid item>
                                <Link to="/komponist">View Komponist Records</Link>
                            </Grid>
                            <Grid item>
                                <Link to="/">DUMMY</Link>
                            </Grid>
                        </Grid>
                        <Grid container justify="center" spacing="7">
                            <Grid item>
                                <Link to="/konzert">View Konzert Records</Link>
                            </Grid>
                            <Grid item>
                                <Link to="/">DUMMY</Link>
                            </Grid>
                        </Grid>
                        <Grid container justify="center" spacing="7">
                            <Grid item>
                                <Link to="/testPage">Go to testPage</Link>
                            </Grid>
                        </Grid>
                    </form>
                </div>

            </Container>
        )
    }
}

export default withStyles(useStyles)(testPage);