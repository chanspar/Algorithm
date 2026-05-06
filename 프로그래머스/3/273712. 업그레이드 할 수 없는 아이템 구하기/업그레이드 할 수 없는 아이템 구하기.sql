with chk_item as(
    select
        distinct parent_item_id
    from
        item_tree
    where
        parent_item_id is not null
)


select
    item_id, item_name, rarity
from
    ITEM_INFO
where
    item_id not in (SELECT parent_item_id FROM chk_item)
order by item_id desc
