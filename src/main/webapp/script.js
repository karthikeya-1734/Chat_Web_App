function sendMessage() {
    const messageInput = document.getElementById('messageInput');
    const chatMessages = document.getElementById('chatMessages');

    if (messageInput.value.trim() !== '') {
        const newMessage = document.createElement('div');
        newMessage.classList.add('message', 'sent');
        newMessage.textContent = messageInput.value;
        chatMessages.appendChild(newMessage);

        messageInput.value = '';
        chatMessages.scrollTop = chatMessages.scrollHeight;
    }
}

document.getElementById('messageInput').addEventListener('keypress', function (e) {
    if (e.key === 'Enter') {
        sendMessage();
    }
});
