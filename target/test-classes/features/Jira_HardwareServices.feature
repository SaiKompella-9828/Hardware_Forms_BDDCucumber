Feature: Jira Hardware Services Functionality
@SimpleServiceRequests
Scenario Outline: Validating SimpleServiceRequests
Given User is on Jira SSO Login Page
When User should login through <Username> and <Password>
Then User Clicks on Hardware Services Module
And  User completes <Requests> functionality
And Hardware Services Testing is Completed
Examples:
| Username | Password | Requests |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Headset |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Mouse |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Privacy Filter |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Desktop |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Webcam |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Portable Speakerphone |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Yubikey |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Keyboard |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Docking Station |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Chargers |

@ITServiceRequests
Scenario Outline: Validating ITServiceRequests
Given User is on Jira SSO Login Page
When User should login through <Username> and <Password>
Then User Clicks on Hardware Services Module
And  User completes <Requests> functionality Itsr
And Hardware Services Testing is Completed
Examples:
| Username | Password | Requests |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | Corporate Mobile Device |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 | ADA Equipment |




                                                   


