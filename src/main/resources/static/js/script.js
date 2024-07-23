function sortData() {
    const dataInput = document.getElementById('dataInput').value;
    const algorithm = document.getElementById('algorithm').value;
    const data = dataInput.split(',').map(item => item.trim());

    fetch('/api/sort', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ data, algorithm })
    })
    .then(response => response.json())
    .then(sortedData => displayData(sortedData))
    .catch(error => console.error('Error:', error));
}

function displayData(data) {
    const visualization = document.getElementById('visualization');
    visualization.innerHTML = '';
    data.forEach(item => {
        const bar = document.createElement('div');
        bar.style.height = `${item.length * 20}px`;
        bar.style.width = '20px';
        bar.style.backgroundColor = 'blue';
        bar.style.margin = '0 5px';
        bar.textContent = item;
        visualization.appendChild(bar);
    });
}
