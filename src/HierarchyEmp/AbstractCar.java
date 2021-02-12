package HierarchyEmp;

import annotation.NumberCheck;

import static Lessons.MyUtils.getRandomFromRange;
import static Lessons.MyUtils.getRandomItem;

    public abstract class AbstractCar {
        @NumberCheck(min= 1995, max = 2020)
        protected Integer data;
        protected Integer tO;
        protected String mark;


        public AbstractCar(Integer data, Integer tO, String brand) {
            this.data = getRandomFromRange(1960, 2020);
            this.tO = getRandomFromRange(1, 100);
            this.mark= getRandomItem(new String[]{"Honda", "Mercedes", "BMW"});

        }

        public abstract int getPrice();

    }


