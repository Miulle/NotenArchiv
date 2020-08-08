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

export default function AddKomponist() {
    const classes = useStyles();
    const [firstLoad, setLoad] = React.useState(true);

    const [kompID, setKompID] = React.useState("");
    const [name, setName] = React.useState("");
    const [firstname, setFirstname] = React.useState("");
    const [birthday, setBirthday] = React.useState(new Date("2020-01-01T01:01:01"));
    const [dayofdeath, setDayofdeath] = React.useState(new Date("2020-01-02T01:01:01"));
    const [description, setDescription] = React.useState("");

    const handlekompIDChange = event => setKompID(event.target.value);
    const handleNameChange = event => setName(event.target.value);
    const handleFirstNameChange = event => setFirstname(event.target.value);
    const handleBirthdayChange = event => setBirthday(event.target.value);
    const handleDayofDeathChange = event => setDayofdeath(event.target.value);
    const handleDescriptionChange = event => setDescription(event.target.value);

    const [message, setMessage] = React.useState("Nothing saved in this session");

    async function sampleFunc(toInput) {
        console.log(toInput);
        // console.log("Sterbejahr date = " + toInput.sterbejahr.getDate);
        // if (toInput.sterbejahr.getDate == null) {
        //     toInput.sterbejahr = new Date(null);
        // }
        const response = await fetch("/api/komponist", {
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
        console.log(body.id);
        setMessage(body.komp_id ? "Data successfully updated" : "Data update failed");
    }

    const handleSubmit = variables => {
        const toInput = { komp_id: kompID, name, vorname: firstname, geburtsjahr: birthday, sterbejahr: dayofdeath, beschreibung: description };
        console.log(dayofdeath);
        sampleFunc(toInput);
        setKompID("");
        setName("");
        setFirstname("");
        setDescription("");
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
                    Komponist hinzufügen
                </Typography>
                <form className={classes.form} noValidate>
                    <Grid container spacing={2}>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                required
                                fullWidth
                                inputProps={{
                                    maxLength: 10
                                }}
                                helperText={`max length: ${kompID.length}/${10}`}
                                id="kompID"
                                value={kompID}
                                label="KomponistID"
                                name="kompID"
                                autoComplete="KomponistenID"
                                onChange={handlekompIDChange}
                            />
                        </Grid>
                        <Grid item xs={12} sm={6}>
                            <TextField
                                variant="outlined"
                                required
                                fullWidth
                                id="name"
                                value={name}
                                label="Name"
                                name="name"
                                autoComplete="name"
                                inputProps={{
                                    maxLength: 20
                                }}
                                onChange={handleNameChange}
                            />
                        </Grid>
                        <Grid item xs={12} sm={6}>
                            <TextField
                                variant="outlined"
                                required
                                fullWidth
                                id="vorname"
                                value={firstname}
                                label="Vorname"
                                name="vorname"
                                autoComplete="vorname"
                                inputProps={{
                                    maxLength: 20
                                }}
                                onChange={handleFirstNameChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                variant="outlined"
                                fullWidth
                                id="beschreibung"
                                value={description}
                                label="Beschreibung"
                                name="beschreibung"
                                autoComplete="beschreibung"
                                multiline
                                inputProps={{
                                    maxLength: 246
                                }}
                                onChange={handleDescriptionChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                id="geburtsjahr"
                                label="Geburtsdatum"
                                type="date"
                                defaultValue="2020-02-01"
                                className={classes.textField}
                                InputLabelProps={{
                                    shrink: true
                                }}
                                onChange={handleBirthdayChange}
                            />
                        </Grid>
                        <Grid item xs={12}>
                            <TextField
                                id="sterbejahr"
                                label="Sterbedatum"
                                type="date"
                                defaultValue="2020-02-02"
                                className={classes.textField}
                                InputLabelProps={{
                                    shrink: true
                                }}
                                onChange={handleDayofDeathChange}
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
                            <Link to="/komponist">View Komponist Records</Link>
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