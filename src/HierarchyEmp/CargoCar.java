package HierarchyEmp;

import HierarchyEmp.CarSalon;
import static Lessons.MyUtils.getRandomFromRange;

    public class CargoCar extends AbstractCar{


        protected Integer weight;
        protected Integer age;
        public CargoCar(Integer data, Integer tO, String mark, Integer weight) {
            super(data, tO, mark);
            this.weight = getRandomFromRange(200, 1000);
            this.age= getRandomFromRange(2,50);
        }

        @Override
        public int getPrice() {
            return weight*  age *   data  * tO;

        }

    }

