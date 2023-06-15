import { useState } from 'react';

const MessageInput = () => {
    const [message, setMessage] = useState("");

    const updateMe = event => setMessage(event.target.value)

    const submit = event => {
        event.preventDefault();
        console.log(`Your message is: "${message}"`);
        setMessage("");
    }

    return (
        <form onSubmit={submit}>
            <input type="text" value={message} onChange={updateMe} />
            <input type="submit" value="Send this message!" />
        </form>
    )
}
export default MessageInput;