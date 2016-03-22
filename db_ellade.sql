-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Creato il: Mar 22, 2016 alle 09:37
-- Versione del server: 10.1.10-MariaDB
-- Versione PHP: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ellade`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `evento`
--

CREATE TABLE `evento` (
  `idevento` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `data_inizio` date NOT NULL,
  `data_fine` date NOT NULL,
  `ora_inizio` time NOT NULL,
  `ora_fine` time NOT NULL,
  `amministratore_evento` varchar(25) NOT NULL,
  `idgruppo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `gruppo`
--

CREATE TABLE `gruppo` (
  `idgruppo` int(11) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `tipologia` varchar(25) NOT NULL,
  `amministratore_gruppo` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `partecipante_evento`
--

CREATE TABLE `partecipante_evento` (
  `username` varchar(25) NOT NULL,
  `idevento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `partecipante_gruppo`
--

CREATE TABLE `partecipante_gruppo` (
  `username` varchar(25) NOT NULL,
  `idgruppo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE `utente` (
  `username` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`username`, `email`, `password`) VALUES
('cham', 'cham@gmail.com', 'b0a8ee5c5bad6ac0064dabfa431a41a73186ce4a'),
('robby', 'robby@gmail.com', 'bcf5e6cab6556015e11d1a350044235371b97159'),
('zava', 'zava@gmail.com', '45443426ef8a10b9f2cabd8a869b4648fd9dfd1f');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`idevento`),
  ADD KEY `amministratore_evento` (`amministratore_evento`),
  ADD KEY `idgruppo` (`idgruppo`),
  ADD KEY `amministratore_evento_2` (`amministratore_evento`);

--
-- Indici per le tabelle `gruppo`
--
ALTER TABLE `gruppo`
  ADD PRIMARY KEY (`idgruppo`),
  ADD UNIQUE KEY `nome` (`nome`,`tipologia`),
  ADD KEY `amministratore_gruppo` (`amministratore_gruppo`),
  ADD KEY `amministratore_gruppo_2` (`amministratore_gruppo`);

--
-- Indici per le tabelle `partecipante_evento`
--
ALTER TABLE `partecipante_evento`
  ADD PRIMARY KEY (`username`,`idevento`),
  ADD KEY `idevento` (`idevento`),
  ADD KEY `username` (`username`);

--
-- Indici per le tabelle `partecipante_gruppo`
--
ALTER TABLE `partecipante_gruppo`
  ADD PRIMARY KEY (`username`,`idgruppo`),
  ADD KEY `idgruppo` (`idgruppo`),
  ADD KEY `username` (`username`);

--
-- Indici per le tabelle `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`username`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `evento`
--
ALTER TABLE `evento`
  MODIFY `idevento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `gruppo`
--
ALTER TABLE `gruppo`
  MODIFY `idgruppo` int(11) NOT NULL AUTO_INCREMENT;
--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `evento`
--
ALTER TABLE `evento`
  ADD CONSTRAINT `fk_amministratore_evento` FOREIGN KEY (`amministratore_evento`) REFERENCES `utente` (`username`),
  ADD CONSTRAINT `fk_idgruppo_evento` FOREIGN KEY (`idgruppo`) REFERENCES `gruppo` (`idgruppo`);

--
-- Limiti per la tabella `gruppo`
--
ALTER TABLE `gruppo`
  ADD CONSTRAINT `fk_amministratore_gruppo` FOREIGN KEY (`amministratore_gruppo`) REFERENCES `utente` (`username`);

--
-- Limiti per la tabella `partecipante_evento`
--
ALTER TABLE `partecipante_evento`
  ADD CONSTRAINT `fk_idevento_evento` FOREIGN KEY (`idevento`) REFERENCES `evento` (`idevento`),
  ADD CONSTRAINT `fk_username_utente` FOREIGN KEY (`username`) REFERENCES `utente` (`username`);

--
-- Limiti per la tabella `partecipante_gruppo`
--
ALTER TABLE `partecipante_gruppo`
  ADD CONSTRAINT `fk_idgruppo_partecipa` FOREIGN KEY (`idgruppo`) REFERENCES `gruppo` (`idgruppo`),
  ADD CONSTRAINT `fk_username_partecipa` FOREIGN KEY (`username`) REFERENCES `utente` (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
