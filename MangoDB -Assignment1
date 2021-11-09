Insert documents:
-----------------

db.movies.insert({title: "Fight Ciub",writer:"Chuck Palahniuko",year: 1999,actors:["Brad Pitt"," Edward Narton"]})
{ acknowledged: true,
  insertedIds: { '0': ObjectId("617ee1b9e2ec49accf4b36d9") } }
db.movies.insertOne({title:"pulp Fiction",writer:"Quentin Tarantino",year:1994,actors:["John Travolta","uma Thurman"]})
{ acknowledged: true,
  insertedId: ObjectId("617ee345e2ec49accf4b36da") }

db.movies.insertOne({title:"Inglorious Basterds",writer:"Quentin Tarantino",year:2009,actors:["Brad pitt","Diane Kruger","Eli Rohit"]})
{ acknowledged: true,
  insertedId: ObjectId("617ee56fe2ec49accf4b36db") }

db.movies.insertOne({title:"The Hobit: An Unexpected journey",writer:"J.R.R Tolkein",year:2012,franchise:"The Hobbit"})
{ acknowledged: true,
  insertedId: ObjectId("617ee6e5e2ec49accf4b36dc") }

db.movies.insertOne({title:"The Hobit: The Desoiation of Smaug",writer:"J.R.R Tolkein",year:2013,franchise:"The Hobbit"})
{ acknowledged: true,
  insertedId: ObjectId("617ee8b7e2ec49accf4b36dd") }

db.movies.insertOne({title:"The Hobit: The Battle of the five Armies",writer:"J.R.R Tolkein",year:2012,franchise:"The Hobbit",synopsis:"Bilbo Company are forced to engage in awar againest an array of combatants and keep the lonely Mountain from falling into the hands of rising darkness"})
{ acknowledged: true,
  insertedId: ObjectId("617eea3fe2ec49accf4b36de") }

db.movies.insertOne({title:"Pee Wee Hermans Big Adventure"})
{ acknowledged: true,
  insertedId: ObjectId("617eeaabe2ec49accf4b36df") }

db.movies.insertOne({title:"Avatar"})
{ acknowledged: true,
  insertedId: ObjectId("617eeacce2ec49accf4b36e0") }

Find Documents:
---------------

db.movies.find()
{ _id: ObjectId("617ee1b9e2ec49accf4b36d9"),
  title: 'Fight Ciub',
  writer: 'Chuck Palahniuko',
  year: 1999,
  actors: [ 'Brad Pitt', ' Edward Narton' ] }
{ _id: ObjectId("617ee345e2ec49accf4b36da"),
  title: 'pulp Fiction',
  writer: 'Quentin Tarantino',
  year: 1994,
  actors: [ 'John Travolta', 'uma Thurman' ] }
{ _id: ObjectId("617ee56fe2ec49accf4b36db"),
  title: 'Inglorious Basterds',
  writer: 'Quentin Tarantino',
  year: 2009,
  actors: [ 'Brad pitt', 'Diane Kruger', 'Eli Rohit' ] }
{ _id: ObjectId("617ee6e5e2ec49accf4b36dc"),
  title: 'The Hobit: An Unexpected journey',
  writer: 'J.R.R Tolkein',
  year: 2012,
  franchise: 'The Hobbit' }
{ _id: ObjectId("617ee8b7e2ec49accf4b36dd"),
  title: 'The Hobit: The Desoiation of Smaug',
  writer: 'J.R.R Tolkein',
  year: 2013,
  franchise: 'The Hobbit' }
{ _id: ObjectId("617eea3fe2ec49accf4b36de"),
  title: 'The Hobit: The Battle of the five Armies',
  writer: 'J.R.R Tolkein',
  year: 2012,
  franchise: 'The Hobbit',
  synopsis: 'Bilbo Company are forced to engage in awar againest an array of combatants and keep the lonely Mountain from falling into the hands of rising darkness' }
{ _id: ObjectId("617eeaabe2ec49accf4b36df"),
  title: 'Pee Wee Hermans Big Adventure' }
{ _id: ObjectId("617eeacce2ec49accf4b36e0"), title: 'Avatar' }


db.movies.find({writer: "Quentin Tarantino"})
{ _id: ObjectId("617ee345e2ec49accf4b36da"),
  title: 'pulp Fiction',
  writer: 'Quentin Tarantino',
  year: 1994,
  actors: [ 'John Travolta', 'uma Thurman' ] }
{ _id: ObjectId("617ee56fe2ec49accf4b36db"),
  title: 'Inglorious Basterds',
  writer: 'Quentin Tarantino',
  year: 2009,
  actors: [ 'Brad pitt', 'Diane Kruger', 'Eli Rohit' ] }

db.movies.find({actors:"Brad Pitt"})
{ _id: ObjectId("617ee1b9e2ec49accf4b36d9"),
  title: 'Fight Ciub',
  writer: 'Chuck Palahniuko',
  year: 1999,
  actors: [ 'Brad Pitt', ' Edward Narton' ] }

db.movies.find({franchise:"The Hobbit"})
{ _id: ObjectId("617ee6e5e2ec49accf4b36dc"),
  title: 'The Hobit: An Unexpected journey',
  writer: 'J.R.R Tolkein',
  year: 2012,
  franchise: 'The Hobbit' }
{ _id: ObjectId("617ee8b7e2ec49accf4b36dd"),
  title: 'The Hobit: The Desoiation of Smaug',
  writer: 'J.R.R Tolkein',
  year: 2013,
  franchise: 'The Hobbit' }
{ _id: ObjectId("617eea3fe2ec49accf4b36de"),
  title: 'The Hobit: The Battle of the five Armies',
  writer: 'J.R.R Tolkein',
  year: 2012,
  franchise: 'The Hobbit',
  synopsis: 'Bilbo Company are forced to engage in awar againest an array of combatants and keep the lonely Mountain from falling into the hands of rising darkness' }


db.movies.find({year:{$lt:2000}})
{ _id: ObjectId("617ee1b9e2ec49accf4b36d9"),
  title: 'Fight Ciub',
  writer: 'Chuck Palahniuko',
  year: 1999,
  actors: [ 'Brad Pitt', ' Edward Narton' ] }
{ _id: ObjectId("617ee345e2ec49accf4b36da"),
  title: 'pulp Fiction',
  writer: 'Quentin Tarantino',
  year: 1994,
  actors: [ 'John Travolta', 'uma Thurman' ] }

db.movies.find({year:{$lt:2010,$gt:2000}})
{ _id: ObjectId("617ee56fe2ec49accf4b36db"),
  title: 'Inglorious Basterds',
  writer: 'Quentin Tarantino',
  year: 2009,
  actors: [ 'Brad pitt', 'Diane Kruger', 'Eli Rohit' ] }

Update Documents:
-----------------


db.movies.updateOne({titla:"The Hobbit: An Unexpected journey"},{$set:{synopsis:"A reluctan hobbit,Bilbo Baggins,sets out to the lonely Mountain with a spirited group of dwarves to reclaim their mountain home and the gold within it from the dragon smaug"}})
{ acknowledged: true,
  insertedId: null,
  matchedCount: 0,
  modifiedCount: 0,
  upsertedCount: 0 }

db.movies.updateOne({title:"Pulp Fiction"},{$set:{actors:"Samuel L Jackson"}})
{ acknowledged: true,
  insertedId: null,
  matchedCount: 0,
  modifiedCount: 0,
  upsertedCount: 0 }

db.movies.insertOne({title:"Pulp Fiction"},{$set:{actors:"Samuel L Jackson"}})
{ acknowledged: true,
  insertedId: ObjectId("617eff1ae2ec49accf4b36e1") }

(Text Search)
=============

db.movies.createIndex({synopsis:'text'})

 db.movies.find({$text:{$search:'Bilbo'}})
 db.movies.find({$text:{$search:'Gandalf'}})
 db.movies.find({$text:{$search:'Bilbo -Gandalf'}})                
 db.movies.find({$text:{$search:'dwarves hobbit'}})          
 db.movies.find({$text:{$search:"'gold' 'dragon'"}})    


Delete Documents:
----------------
db.movies.deleteOne({title:"Avatar"})
{ acknowledged: true, deletedCount: 0 }

db.Movies.deleteOne({title:"Pee Wee Hermans Big Adventure"})
{ acknowledged: true, deletedCount: 0 }

Relationships:
-------------

db.createCollection("user")
{ ok: 1 }

db.user.insertMany([{username:"GoogGuyGreg",first_name:"Good Guy",last_name:"Greg"},{username:"ScumbagStev",full_name:{first:"Scumbag",last:"Steve"}}])
{ acknowledged: true,
  insertedIds: 
   { '0': ObjectId("617faf915a092e02e40c9f29"),
     '1': ObjectId("617faf915a092e02e40c9f2a") } }

db.createCollection("posts")

{ ok: 1 }
db.posts.insertMany([{username:"GoodGuyGreg",title:"passes out at party",body:"Wakes up early and house"}])
{ acknowledged: true,
  insertedIds: { '0': ObjectId("617fb06c5a092e02e40c9f2b") } }

db.posts.insertMany([{username:"GoodGuyGreg",title:"Steals your identity",body:"Raises your credit score"}])
{ acknowledged: true,
  insertedIds: { '0': ObjectId("617fb1915a092e02e40c9f2c") } }

db.posts.insertMany([{username:"GoodGuyGreg",title:"Reports a bug in your code",body:"Sends you a pull Request"}])
{ acknowledged: true,
  insertedIds: { '0': ObjectId("617fb27f5a092e02e40c9f2d") } }
db.posts.insertMany([{username:"ScumbagSteve",title:"Borrows something",body:"Sells it"}])
{ acknowledged: true,
  insertedIds: { '0': ObjectId("617fb31f5a092e02e40c9f2e") } }
db.posts.insertMany([{username:"ScumbagSteve",title:"Borrows everything",body:"The end"}])
{ acknowledged: true,
  insertedIds: { '0': ObjectId("617fb3895a092e02e40c9f2f") } }
db.posts.insertMany([{username:"ScumbagStev",title:"Forks your repo on github",body:"Sets to private"}])
{ acknowledged: true,
  insertedIds: { '0': ObjectId("617fb4065a092e02e40c9f30") } }

db.createCollection("comments")
{ ok: 1 }
db.comments.insertMany([{username:"GoodGuyGreg",comment:"Hope you got agood deal!",post:"617fb31f5a092e02e40c9f2e"},{username:"GoodGuyGreg",comment:"Whats mine is youes!",post:"617fb3895a092e02e40c9f2f"},{username:"GoodGuyGreg",comment:"Dont violate the licensing agreement!",post:"617fb4065a092e02e40c9f30"},{username:"ScumbagSteve",comment:"it still is't clean",post:"617fb06c5a092e02e40c9f2b"},{username:"ScumbagSteve",comment:"Denied your PR cause i found a hack",post:"617fb27f5a092e02e40c9f2d"}]);
{ acknowledged: true,
  insertedIds: 
   { '0': ObjectId("617fba945a092e02e40c9f37"),
     '1': ObjectId("617fba945a092e02e40c9f38"),
     '2': ObjectId("617fba945a092e02e40c9f39"),
     '3': ObjectId("617fba945a092e02e40c9f3a"),
     '4': ObjectId("617fba945a092e02e40c9f3b") } }
db.user.find().pretty()
{ _id: ObjectId("617faf915a092e02e40c9f29"),
  username: 'GoogGuyGreg',
  first_name: 'Good Guy',
  last_name: 'Greg' }
{ _id: ObjectId("617faf915a092e02e40c9f2a"),
  username: 'ScumbagStev',
  full_name: { first: 'Scumbag', last: 'Steve' } }
db.user.find()
{ _id: ObjectId("617faf915a092e02e40c9f29"),
  username: 'GoogGuyGreg',
  first_name: 'Good Guy',
  last_name: 'Greg' }
{ _id: ObjectId("617faf915a092e02e40c9f2a"),
  username: 'ScumbagStev',
  full_name: { first: 'Scumbag', last: 'Steve' } }
db.posts.find()
{ _id: ObjectId("617fb06c5a092e02e40c9f2b"),
  username: 'GoodGuyGreg',
  title: 'passes out at party',
  body: 'Wakes up early and house' }
{ _id: ObjectId("617fb1915a092e02e40c9f2c"),
  username: 'GoodGuyGreg',
  title: 'Steals your identity',
  body: 'Raises your credit score' }
{ _id: ObjectId("617fb27f5a092e02e40c9f2d"),
  username: 'GoodGuyGreg',
  title: 'Reports a bug in your code',
  body: 'Sends you a pull Request' }
{ _id: ObjectId("617fb31f5a092e02e40c9f2e"),
  username: 'ScumbagSteve',
  title: 'Borrows something',
  body: 'Sells it' }
{ _id: ObjectId("617fb3895a092e02e40c9f2f"),
  username: 'ScumbagSteve',
  title: 'Borrows everything',
  body: 'The end' }
{ _id: ObjectId("617fb4065a092e02e40c9f30"),db.comments.find()
{ _id: ObjectId("617fb5f75a092e02e40c9f31"),
  username: 'GoodGuyGreg',
  comment: 'Hope you got agood deal!',
  post: '[post_obj_id]',
  'Where[post_obj_id]is the objectid of the posts documents': 'Borrows something' }
{ _id: ObjectId("617fb6995a092e02e40c9f32"),
  username: 'GoodGuyGreg',
  comment: 'Hope you got agood deal!',
  post: '617fb31f5a092e02e40c9f2e' }
{ _id: ObjectId("617fb9625a092e02e40c9f33"),
  username: 'GoodGuyGreg',
  comment: 'Hope you got agood deal!',
  post: '617fb31f5a092e02e40c9f2e' }
{ _id: ObjectId("617fb9625a092e02e40c9f34"),
  username: 'GoodGuyGreg',
  comment: 'Whats mine is youes!',
  post: '617fb3895a092e02e40c9f2f' }
{ _id: ObjectId("617fb9625a092e02e40c9f35"),
  username: 'GoodGuyGreg',
  comment: 'Dont violate the licensing agreement!',
  post: '617fb4065a092e02e40c9f30' }
{ _id: ObjectId("617fb9625a092e02e40c9f36"),
  username: 'ScumbagSteve',
  comment: 'it still is\'t clean',
  post: '617fb06c5a092e02e40c9f2b' }
{ _id: ObjectId("617fba945a092e02e40c9f37"),
  username: 'GoodGuyGreg',
  comment: 'Hope you got agood deal!',
  post: '617fb31f5a092e02e40c9f2e' }
{ _id: ObjectId("617fba945a092e02e40c9f38"),
  username: 'GoodGuyGreg',
  comment: 'Whats mine is youes!',
  post: '617fb3895a092e02e40c9f2f' }
{ _id: ObjectId("617fba945a092e02e40c9f39"),
  username: 'GoodGuyGreg',
  comment: 'Dont violate the licensing agreement!',
  post: '617fb4065a092e02e40c9f30' }
{ _id: ObjectId("617fba945a092e02e40c9f3a"),
  username: 'ScumbagSteve',
  comment: 'it still is\'t clean',
  post: '617fb06c5a092e02e40c9f2b' }
{ _id: ObjectId("617fba945a092e02e40c9f3b"),
  username: 'ScumbagSteve',
  comment: 'Denied your PR cause i found a hack',
  post: '617fb27f5a092e02e40c9f2d' }
db.comments.find({post:"Reports a bug in your code"})
  db.comments.find({post:"617fb06c5a092e02e40c9f2b"})
{ _id: ObjectId("617fb9625a092e02e40c9f36"),
  username: 'ScumbagSteve',
  comment: 'it still is\'t clean',
  post: '617fb06c5a092e02e40c9f2b' }
{ _id: ObjectId("617fba945a092e02e40c9f3a"),
  username: 'ScumbagSteve',
  comment: 'it still is\'t clean',
  post: '617fb06c5a092e02e40c9f2b' }
  username: 'ScumbagStev',
  title: 'Forks your repo on github',
  body: 'Sets to private' }

