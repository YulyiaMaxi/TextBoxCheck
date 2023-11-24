
@Test
void ShouldTestTextBox() {
        // загрузить страницу через jar-файл
        driver.get("http://localhost:9999);
        List < WebElement > elements = driver.findElements(By.className("mr-sm-2 form-control"));
        elements.get(0).sendKeys("Yulia Maksimova");
        elements.get(1).sendKeys("orjuice@mail.ru");
        List<WebElement> elements2 = driver.findElements(By.className("form-control"));
        elements2.get(0).sendKeys("Moscow, Zhukova avenue, 43, 2, 53");
        elements2.get(1).sendKeys("Moscow, Zhukova avenue, 43, 2, 53");
        driver.findElement(By.className("btn btn-primary")).click();
        List<Data> data = driver.findElements(By.className("mb-1"));
        String text = data.get(0).getText() + data.get(1).getText() + data.get(2).getText() + data.get(3).getText();
        assertEquals(expected:"Name:Yulia Maximova\n" + "\n" + "Email:orjuice@mail.ru\n" + "\n" + "Current Address :Moscow, Zhukova avenue, 43, 2, 53\n" + "\n" + "Permananet Address :Moscow, Zhukova avenue, 43, 2, 53", text)
        }
