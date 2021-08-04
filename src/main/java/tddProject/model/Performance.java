package tddProject.model;

import java.math.BigDecimal;

public enum Performance {
    TO_BE_DESIRED {
        @Override
        public BigDecimal readjustmentPercentage(){
            return new BigDecimal("0.03");
        }
    },
    GOOD {
        @Override
        public BigDecimal readjustmentPercentage(){
            return new BigDecimal("0.15");
        }
    },
    EXCELLENT {
        @Override
        public BigDecimal readjustmentPercentage(){
            return new BigDecimal("0.2");
        }
    };

    public abstract BigDecimal readjustmentPercentage();
}
