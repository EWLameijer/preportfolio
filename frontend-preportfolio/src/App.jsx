import { useEffect, useState } from 'react';

const App = () => {
    const [message, setMessage] = useState({});
    
    useEffect(() => {
        fetch(`http://localhost:8080/api/v1/message`)
            .then(response => response.json())
            .then(actualData => setMessage(actualData))
            .catch(err => console.log(`An error has occurred: ${err.message}.`))
    }, []);

    return <p>{message !== null ? `Message from ${message.sender}: "${message.contents}"` : "Your message is being loaded..."}</p>
}

export default App
