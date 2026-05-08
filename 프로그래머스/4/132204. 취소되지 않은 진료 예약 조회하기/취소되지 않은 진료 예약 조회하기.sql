-- PATIENT: 환자 정보
-- DOCTOR: 의사 정보
-- APPOINTMENT: 둘을 엮는 테이블  PT_NO, MDDR_ID(닥터)

select
    A.APNT_NO,
    P.PT_NAME,
    P.PT_NO,
    A.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
from
    APPOINTMENT as A
    JOIN PATIENT as P
    on A.PT_NO = P.PT_NO
    JOIN DOCTOR as D
    on A.MDDR_ID = D.DR_ID
where
    date_format(A.APNT_YMD, '%Y-%m-%d') = '2022-04-13'
    and A.APNT_CNCL_YN = 'N'
order by
    A.APNT_YMD