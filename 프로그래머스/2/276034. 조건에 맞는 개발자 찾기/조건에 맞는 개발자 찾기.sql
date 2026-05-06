select
    ID,
    email,
    first_name,
    last_name
from
    DEVELOPERS
where
    (SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python')) > 0
    OR
    (SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')) > 0
order by
    id;