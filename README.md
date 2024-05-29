<h1>Blockchain Workshop</h1>
<p>This project demonstrates the core components of a blockchain using Java and Spring Boot. It includes basic blockchain functionalities such as adding transactions, mining blocks, and validating the blockchain.</p>
<p>Project Structure</p>
      <p>The project is divided into several packages, each responsible for different aspects of the blockchain:</p>
      <ul>
        <li>Configuration: Contains configuration classes for setting up beans and application settings.</li>
        <li>Controller: REST controllers for handling HTTP requests related to blockchain operations.</li>
        <li>Entities: Entity classes representing blockchain components such as Block, Blockchain, Transaction, and Wallet.</li>
        <li>Exemples: Utility classes for encryption and hashing.</li>
        <li>Helper: Helper classes for common functionalities used across the application.</li>
        <li>Mining: Classes related to the mining process, including the proof of work algorithm.</li>
        <li>Service: Service classes that encapsulate the business logic of the application.</li>
      </ul>

      <p>Key Components</p>
      <p>Configuration</p>
      <ul>
        <li>BlockchainConfig: A configuration class that sets up a singleton instance of the Blockchain class with a specified difficulty level.</li>
      </ul>

      <p>Controllers</p>
      <ul>
        <li>BlockchainController: Handles endpoints for retrieving the blockchain, adding transactions, mining blocks, and validating the chain. It also allows for retrieving specific blocks and the transaction pool.</li>
        <li>NodeController: Manages network-related actions such as registering new nodes in the blockchain network.</li>
        <li>WalletController: Provides endpoints for creating wallets and signing transactions.</li>
      </ul>

      <p>Entities</p>
      <ul>
        <li>Block: Represents a single block in the blockchain, containing an index, timestamp, transactions, nonce, previous hash, and current hash.</li>
        <li>Blockchain: Represents the blockchain itself, managing a list of blocks, a pool of pending transactions, and the overall chain validity.</li>
        <li>Transaction: Represents a single transaction within the blockchain, including details such as sender, receiver, and amount.</li>
        <li>Wallet: Represents a wallet for holding digital currency, capable of signing transactions.</li>
      </ul>

      <p>Services</p>
      <ul>
        <li>NetworkService: Handles network operations such as broadcasting transactions and blocks to other nodes.</li>
        <li>WalletService: Manages wallet-related operations, including creating wallets and signing transactions.</li>
      </ul>

      <p>Usage</p>
      <ul>
        <li>Retrieve the Blockchain: GET request to /blockchain to get the current blockchain.</li>
        <li>Add a Transaction: POST request to /blockchain/transaction with transaction details.</li>
        <li>Mine a Block: POST request to /blockchain/mine to mine a new block.</li>
        <li>Validate the Blockchain: GET request to /blockchain/validate to check if the blockchain is valid.</li>
        <li>Register a Node: POST request to /network/register with the node's address.</li>
        <li>Create a Wallet: POST request to /wallet/create to generate a new wallet.</li>
        <li>Sign a Transaction: POST request to /wallet/sign with transaction data and wallet details.</li>
      </ul>

      <p>Conclusion</p>
      <p>This project provides a foundational understanding of how a blockchain works, including transaction management, block mining, and network communication. By running and interacting with this project, you can gain insights into the inner workings of a blockchain system.</p>
    
