package entity.comparator;

import entity.CustomArray;
import service.CustomArrayService;
import service.impl.CustomArrayServiceImpl;

import java.util.Comparator;

public enum ArrayComparator implements Comparator<CustomArray> {

    COMPARE_BY_ID {
        @Override
        public int compare(CustomArray o1, CustomArray o2) {
            return Long.compare(o1.getId(), o2.getId());
        }
    },
    COMPARE_BY_MAX {
        @Override
        public int compare(CustomArray o1, CustomArray o2) {
            CustomArrayService customArrayService = new CustomArrayServiceImpl();

            return Integer.compare(customArrayService.findMaxValue(o1), customArrayService.findMaxValue(o2));
        }
    },
    COMPARE_BY_LENGTH {
        @Override
        public int compare(CustomArray o1, CustomArray o2) {
            return o1.getArray().length - o2.getArray().length;
        }
    }
}