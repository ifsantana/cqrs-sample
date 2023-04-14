db = db.getSiblingDB('test')
db.queries.drop();
db.queries.insert(
    [
        { "_id": 1, "description":  "babalbal"}
    ]
);