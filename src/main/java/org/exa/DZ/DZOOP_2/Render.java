package org.exa.DZ.DZOOP_2;

public class Render {

        /**
         * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
         * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
         * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
         */
        String []string = new String[]{"Здоровье","Магия"};
        public void showIndicator(Object object) {
                // Не должно быть упоминания конкретных классов!!!
                if (object instanceof ShowIHealthPoints) {
                        System.out.println("уровень здоровья у " + object.getClass().getSimpleName());
                        paintHeatlth(((ShowIHealthPoints) object).HealthPoint());
                }
                if (object instanceof ShowManaPoints) {
                        paintMana(((ShowManaPoints) object).ManaPoint());
                }
        }
        private void paintHeatlth ( int[] data){
                System.out.printf("Максимальное %s = [%d] ", string[0], data[0]);
                System.out.printf("Текущее %s = [%d] ", string[0], data[1]);
                System.out.println();
        }
        private void paintMana ( int[] data){
                System.out.printf("Максимальная %s = [%d] ", string[1], data[0]);
                System.out.printf("Текущая %s = [%d] ", string[1], data[1]);
                System.out.println();
        }
}
