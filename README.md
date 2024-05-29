<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blockchain Workshop</title>
</head>
<body>
    <h1>Blockchain Workshop</h1>
    <p>This project demonstrates the core components of a blockchain using Java and Spring Boot. It includes basic blockchain functionalities such as adding transactions, mining blocks, and validating the blockchain.</p>
    
    <h2>Project Structure</h2>
    <p>The project is divided into several packages, each responsible for different aspects of the blockchain:</p>
    <ul>
        <li><strong>Configuration:</strong> Contains configuration classes for setting up beans and application settings.</li>
        <li><strong>Controller:</strong> REST controllers for handling HTTP requests related to blockchain operations.</li>
        <li><strong>Entities:</strong> Entity classes representing blockchain components such as Block, Blockchain, Transaction, and Wallet.</li>
        <li><strong>Exemples:</strong> Utility classes for encryption and hashing.</li>
        <li><strong>Helper:</strong> Helper classes for common functionalities used across the application.</li>
        <li><strong>Mining:</strong> Classes related to the mining process, including the proof of work algorithm.</li>
        <li><strong>Service:</strong> Service classes that encapsulate the business logic of the application.</li>
    </ul>

    <h2>Key Components</h2>

    <h3>Configuration</h3>
    <ul>
        <li><strong>BlockchainConfig:</strong> A configuration class that sets up a singleton instance of the Blockchain class with a specified difficulty level.</li>
    </ul>

    <h3>Controllers</h3>
    <ul>
        <li><strong>BlockchainController:</strong> Handles endpoints for retrieving the blockchain, adding transactions, mining blocks, and validating the chain. It also allows for retrieving specific blocks and the transaction pool.</li>
        <li><strong>NodeController:</strong> Manages network-related actions such as registering new nodes in the blockchain network.</li>
        <li><strong>WalletController:</strong> Provides endpoints for creating wallets and signing transactions.</li>
    </ul>

    <h3>Entities</h3>
    <ul>
        <li><strong>Block:</strong> Represents a single block in the blockchain, containing an index, timestamp, transactions, nonce, previous hash, and current hash.</li>
        <li><strong>Blockchain:</strong> Represents the blockchain itself, managing a list of blocks, a pool of pending transactions, and the overall chain validity.</li>
        <li><strong>Transaction:</strong> Represents a single transaction within the blockchain, including details such as sender, receiver, and amount.</li>
        <li><strong>Wallet:</strong> Represents a wallet for holding digital currency, capable of signing transactions.</li>
    </ul>

    <h3>Services</h3>
    <ul>
        <li><strong>NetworkService:</strong> Handles network operations such as broadcasting transactions and blocks to other nodes.</li>
        <li><strong>WalletService:</strong> Manages wallet-related operations, including creating wallets and signing transactions.</li>
    </ul>

    <h2>Usage</h2>
    <ul>
        <li><strong>Retrieve the Blockchain:</strong> GET request to /blockchain to get the current blockchain.</li>
        <li><strong>Add a Transaction:</strong> POST request to /blockchain/transaction with transaction details.</li>
        <li><strong>Mine a Block:</strong> POST request to /blockchain/mine to mine a new block.</li>
        <li><strong>Validate the Blockchain:</strong> GET request to /blockchain/validate to check if the blockchain is valid.</li>
        <li><strong>Register a Node:</strong> POST request to /network/register with the node's address.</li>
        <li><strong>Create a Wallet:</strong> POST request to /wallet/create to generate a new wallet.</li>
        <li><strong>Sign a Transaction:</strong> POST request to /wallet/sign with transaction data and wallet details.</li>
    </ul>

    <h2>Conclusion</h2>
    <p>This project provides a foundational understanding of how a blockchain works, including transaction management, block mining, and network communication. By running and interacting with this project, you can gain insights into the inner workings of a blockchain system.</p>
</body>
</html>
