# Viper
A scoreboard API for all versions of which support the default minecraft scoreboard

Viper board, created by damt.

### Features
* Supports up to 40 characters per line.
* Light weight.
* Developer friendly. Setup your board in a few lines.
* Can be reloaded
* Changable timing intervals
* Each player has their own scoreboard [Can be used for cores]

### Tested Versions
* 1.8 [40 Characters]

### Code Examples
```java
    @Override
    public void onEnable() {

        new Viper(this, new ViperAdapterExample(), 10);

        /*
        Time = Long Time
        Adapter = Your Scoreboard Adapter (Must extend @ViperBoard)
        Plugin = Your Java Main Class
         */

    }
```

```java
public class ViperAdapterExample extends ViperBoard {

    @Override
    public String getTitle() {
        return "Scoreboard!";
    }

    @Override
    public List<String> getLines(Player player) {
        List<String> lines = new ArrayList<>();
        lines.add("Name: " + player.getName());
        return lines;
    }
```


### Contact

- Discord: damt#0886
- Telegram: https://t.me/therealdamt

### Credits

This README format was taken of Assemble's original format by TheKawaiiiSam
