import React from "react";
import Avatar from "@material-ui/core/Avatar";
import Button from "@material-ui/core/Button";
import CssBaseline from "@material-ui/core/CssBaseline";
import TextField from "@material-ui/core/TextField";
import { Link } from "react-router-dom";
import Grid from "@material-ui/core/Grid";
import GroupIcon from "@material-ui/icons/Group";
import Typography from "@material-ui/core/Typography";
import { makeStyles} from "@material-ui/core/styles";
import Container from "@material-ui/core/Container";

const useStyles = makeStyles(theme => ({
    paper: {
        marginTop: theme.spacing(7),
        display: "flex",
        flexDirection: "column",
        alignItems: "center"
    },
    avatar: {
        margin: theme.spacing(1),
        backgroundColor: theme.palette.secondary.main
    },
    form: {
        width: "100%",
        marginTop: theme.spacing(3)
    },
    submit: {
        margin: theme.spacing(3, 0, 2)
    },
    textField: {
        marginLeft: theme.spacing(1),
        marginRight: theme.spacing(1),
        width: "100%"
    }
}));

export default function AddKonzert() {
    const classes = useStyles();
    const [firstLoad, setLoad] = React.useState(true);

    const [place, setPlace] = React.useState("");
    const [date, setDate] = React.useState(new Date("2020-01-01T01:01:01"));
    const [location, setLocation] = React.useState("");
    const [solist, setSolist] = React.useState("");
    const [solistinstrument, setSolistInstrument] = React.useState("");
    const [annotation, setAnnotation] = React.useState("");
    const [director, setDirector] = React.useState("");

    const handlePlaceChange = event => setPlace(event.target.value);
    const handleDateChange = event => setDate(event.target.value);
    const handleLocationChange = event => setLocation(event.target.value);
    const handleSolistChange = event => setSolist(event.target.value);
    const handleSolistInstrumentChange = event => setSolistInstrument(event.target.value);
    const handleAnnotationChange = event => setAnnotation(event.target.value);
    const handleDirectorChange = event => setDirector(event.target.value);

    const [message, setMessage] = React.useState("Nothing saved in this session");

    async function sampleFunc(toInput) {
        // console.log(toInput);
        const response = await fetch("/api/konzert", {
            method: "POST",
            mode: "cors",
            cache: "no-cache",
            credentials: "same-origin",
            headers: {
                "Content-Type": "application/json"
            },
            redirect: "follow",
            referrerPolicy: "no-referrer",
            body: JSON.stringify(toInput)
        });
        let body = await response.json();
        console.log(body.konzertID);
        setMessage(body.konzertID ? "Data successfully updated" : "Data update failed");
    }

    const handleSubmit = variables => {
        const toInput = { ort: place, datum: date, halle: location, solisten: solist, solistInstrument: solistinstrument, bemerkung: annotation, dirigent: director};
        sampleFunc(toInput);
        setPlace("");
        setLocation("");
        setSolist("");
        setSolistInstrument("");
        setAnnotation("");
        setDirector("");
    };

    if (firstLoad) {
        setLoad(false);
    }

    return (
        <Container component="main" maxWidth="xs">
            <CssBaseline />
            <div className={classes.paper}>
                <Avatar className={classes.avatar}>
                    <GroupIcon />
                </Avatar>
                <Typography component="h1" variant="h5">
                    Konzert hinzufügen
                </Typography>
                <form className={classes.form} noValidate>
                    <Grid container spacing={2}>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                required
                                fullWidth
                                inputProps={{
                                    maxLength: 20
                                }}
                                id="place"
                                value={place}
                                label="Ort"
                                name="place"
                                autoComplete="Ort"
                                onChange={handlePlaceChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                required
                                fullWidth
                                inputProps={{
                                    maxLength: 20
                                }}
                                id="location"
                                value={location}
                                label="Halle"
                                name="location"
                                autoComplete="Halle"
                                onChange={handleLocationChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                required
                                fullWidth
                                id="solist"
                                value={solist}
                                label="solist"
                                name="solist"
                                autoComplete="Solist(en)"
                                multiline
                                inputProps={{
                                    maxLength: 60
                                }}
                                onChange={handleSolistChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                required
                                fullWidth
                                id="solistinstrument"
                                value={solistinstrument}
                                label="Solist(en) Instrument(e)"
                                name="solistinstrument"
                                autoComplete="Instrument, ..."
                                multiline
                                inputProps={{
                                    maxLength: 38
                                }}
                                onChange={handleSolistInstrumentChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                fullWidth
                                id="annotation"
                                value={annotation}
                                label="Bemerkung"
                                name="annotation"
                                autoComplete="Bemerkung"
                                multiline
                                inputProps={{
                                    maxLength: 246
                                }}
                                onChange={handleAnnotationChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                fullWidth
                                id="director"
                                value={director}
                                label="Dirigent"
                                name="director"
                                autoComplete="Dirigent"
                                inputProps={{
                                    maxLength: 246
                                }}
                                onChange={handleDirectorChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                id="date"
                                label="Datum"
                                type="date"
                                className={classes.textField}
                                InputLabelProps={{
                                    shrink: true
                                }}
                                onChange={handleDateChange}
                            />
                        </Grid>
                    </Grid>
                    <Button
                        fullWidth
                        variant="contained"
                        color="primary"
                        preventdefault="true"
                        className={classes.submit}
                        onClick={handleSubmit}
                    >
                        Save
                    </Button>

                    <Grid container justify="center" spacing={7}>
                        <Grid item>
                            <Link to="/konzert">View Konzert Records</Link>
                        </Grid>
                        <Grid item>
                            <Link to="/">Back to landing page</Link>
                        </Grid>
                    </Grid>
                </form>
                <Typography style={{ margin: 7 }} variant="body1">
                    Status: {message}
                </Typography>
            </div>
        </Container>
    );
}