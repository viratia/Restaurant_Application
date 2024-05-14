<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Popup Example</title>
<style>
    .popup {
        display: none;
        position: fixed;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        background-color: #ffffff;
        border: 1px solid #cccccc;
        padding: 20px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.5);
        z-index: 1000;
    }
</style>
</head>
<body>

<button onclick="showPopup()">Show Popup</button>

<div id="popup" class="popup">
    <h2>This is a Popup</h2>
    <p>Hello! This is some content inside a popup.</p>
    <button onclick="hidePopup()">Close Popup</button>
</div>

<script>
    function showPopup() {
        document.getElementById('popup').style.display = 'block';
    }

    function hidePopup() {
        document.getElementById('popup').style.display = 'none';
    }
</script>

</body>
</html>
