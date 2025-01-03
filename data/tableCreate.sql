CREATE TABLE `企业名单` (
  `Name` varchar(36) COLLATE utf8mb3_bin DEFAULT NULL,
  `RegisteredAddress` varchar(154) COLLATE utf8mb3_bin DEFAULT NULL,
  `Type` varchar(44) COLLATE utf8mb3_bin DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `Year` double DEFAULT NULL,
  `Province` varchar(16) COLLATE utf8mb3_bin DEFAULT NULL,
  `City` varchar(22) COLLATE utf8mb3_bin DEFAULT NULL,
  `District` varchar(26) COLLATE utf8mb3_bin DEFAULT NULL,
  `Industry` varchar(40) COLLATE utf8mb3_bin DEFAULT NULL,
  `InsuredNum` varchar(10) COLLATE utf8mb3_bin DEFAULT NULL,
  `InsuredDivision` varchar(22) COLLATE utf8mb3_bin DEFAULT NULL,
  `RegisteredCaptital` varchar(30) COLLATE utf8mb3_bin DEFAULT NULL,
  `CaptitalDivision` varchar(20) COLLATE utf8mb3_bin DEFAULT NULL,
  `Status` varchar(28) COLLATE utf8mb3_bin DEFAULT NULL,
  `FormerName` varchar(94) COLLATE utf8mb3_bin DEFAULT NULL,
  `CommunicationAddress` varchar(138) COLLATE utf8mb3_bin DEFAULT NULL,
  `TaxpayerID` varchar(36) COLLATE utf8mb3_bin DEFAULT NULL,
  `RegisterationID` varchar(30) COLLATE utf8mb3_bin DEFAULT NULL,
  `OrganizationID` varchar(20) COLLATE utf8mb3_bin DEFAULT NULL,
  `Introduction` varchar(1752) COLLATE utf8mb3_bin DEFAULT NULL,
  `BusinessScope` varchar(1894) COLLATE utf8mb3_bin DEFAULT NULL,
  `ListedorNot` varchar(2) COLLATE utf8mb3_bin DEFAULT NULL,
  `ListingType` varchar(6) COLLATE utf8mb3_bin DEFAULT NULL,
  `Abbreviation` varchar(12) COLLATE utf8mb3_bin DEFAULT NULL,
  `StockCode` varchar(18) COLLATE utf8mb3_bin DEFAULT NULL,
  `Products` varchar(92) COLLATE utf8mb3_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
