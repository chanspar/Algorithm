select
    year(DIFFERENTIATION_DATE) as YEAR,
    max(size_of_colony) over(partition by year(DIFFERENTIATION_DATE)) - SIZE_OF_COLONY as YEAR_DEV,
    id
from
    ecoli_data
order by YEAR, YEAR_DEV