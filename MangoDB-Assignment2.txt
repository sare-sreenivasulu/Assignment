db.zipcodes.find({$and:[{city:"ATLANTA"},{state:"GA"}]})
{ _id: '30303',
  city: 'ATLANTA',
  loc: [ -84.388846, 33.752504 ],
  pop: 1845,
  state: 'GA' }
{ _id: '30314',
  city: 'ATLANTA',
  loc: [ -84.425546, 33.756103 ],
  pop: 26649,
  state: 'GA' }
{ _id: '30315',
  city: 'ATLANTA',
  loc: [ -84.380771, 33.705062 ],
  pop: 41061,
  state: 'GA' }
{ _id: '30336',
  city: 'ATLANTA',
  loc: [ -84.510028, 33.78534 ],
  pop: 1228,
  state: 'GA' }
{ _id: '30349',
  city: 'ATLANTA',
  loc: [ -84.481258, 33.605331 ],
  pop: 48116,
  state: 'GA' }
{ _id: '30310',
  city: 'ATLANTA',
  loc: [ -84.423173, 33.727849 ],
  pop: 34017,
  state: 'GA' }
{ _id: '30339',
  city: 'ATLANTA',
  loc: [ -84.462879, 33.87125 ],
  pop: 11158,
  state: 'GA' }
{ _id: '30308',
  city: 'ATLANTA',
  loc: [ -84.375744, 33.771839 ],
  pop: 8549,
  state: 'GA' }
{ _id: '30313',
  city: 'ATLANTA',
  loc: [ -84.39352, 33.76825 ],
  pop: 8038,
  state: 'GA' }
{ _id: '30319',
  city: 'ATLANTA',
  loc: [ -84.335091, 33.868728 ],
  pop: 32138,
  state: 'GA' }
{ _id: '30350',
  city: 'ATLANTA',
  loc: [ -84.341146, 33.979471 ],
  pop: 24573,
  state: 'GA' }
{ _id: '30311',
  city: 'ATLANTA',
  loc: [ -84.470219, 33.722957 ],
  pop: 34880,
  state: 'GA' }
{ _id: '30317',
  city: 'ATLANTA',
  loc: [ -84.31685, 33.749788 ],
  pop: 16395,
  state: 'GA' }
{ _id: '30326',
  city: 'ATLANTA',
  loc: [ -84.358232, 33.848168 ],
  pop: 125,
  state: 'GA' }
{ _id: '30305',
  city: 'ATLANTA',
  loc: [ -84.385145, 33.831963 ],
  pop: 19122,
  state: 'GA' }
{ _id: '30306',
  city: 'ATLANTA',
  loc: [ -84.351418, 33.786027 ],
  pop: 20081,
  state: 'GA' }
{ _id: '30307',
  city: 'ATLANTA',
  loc: [ -84.335957, 33.769138 ],
  pop: 16330,
  state: 'GA' }
{ _id: '30309',
  city: 'ATLANTA',
  loc: [ -84.388338, 33.798407 ],
  pop: 14766,
  state: 'GA' }
{ _id: '30318',
  city: 'ATLANTA',
  loc: [ -84.445432, 33.786454 ],
  pop: 53894,
  state: 'GA' }
{ _id: '30334',
  city: 'ATLANTA',
  loc: [ -84.388188, 33.74715 ],
  pop: 0,
  state: 'GA' }
Type "it" for more
db.zipcodes.aggregate({$match:{$and:[{city:"ATLANTA"},{state:"GA"}]}})
{ _id: '30303',
  city: 'ATLANTA',
  loc: [ -84.388846, 33.752504 ],
  pop: 1845,
  state: 'GA' }
{ _id: '30314',
  city: 'ATLANTA',
  loc: [ -84.425546, 33.756103 ],
  pop: 26649,
  state: 'GA' }
{ _id: '30315',
  city: 'ATLANTA',
  loc: [ -84.380771, 33.705062 ],
  pop: 41061,
  state: 'GA' }
{ _id: '30336',
  city: 'ATLANTA',
  loc: [ -84.510028, 33.78534 ],
  pop: 1228,
  state: 'GA' }
{ _id: '30349',
  city: 'ATLANTA',
  loc: [ -84.481258, 33.605331 ],
  pop: 48116,
  state: 'GA' }
{ _id: '30310',
  city: 'ATLANTA',
  loc: [ -84.423173, 33.727849 ],
  pop: 34017,
  state: 'GA' }
{ _id: '30339',
  city: 'ATLANTA',
  loc: [ -84.462879, 33.87125 ],
  pop: 11158,
  state: 'GA' }
{ _id: '30308',
  city: 'ATLANTA',
  loc: [ -84.375744, 33.771839 ],
  pop: 8549,
  state: 'GA' }
{ _id: '30313',
  city: 'ATLANTA',
  loc: [ -84.39352, 33.76825 ],
  pop: 8038,
  state: 'GA' }
{ _id: '30319',
  city: 'ATLANTA',
  loc: [ -84.335091, 33.868728 ],
  pop: 32138,
  state: 'GA' }
{ _id: '30350',
  city: 'ATLANTA',
  loc: [ -84.341146, 33.979471 ],
  pop: 24573,
  state: 'GA' }
{ _id: '30311',
  city: 'ATLANTA',
  loc: [ -84.470219, 33.722957 ],
  pop: 34880,
  state: 'GA' }
{ _id: '30317',
  city: 'ATLANTA',
  loc: [ -84.31685, 33.749788 ],
  pop: 16395,
  state: 'GA' }
{ _id: '30326',
  city: 'ATLANTA',
  loc: [ -84.358232, 33.848168 ],
  pop: 125,
  state: 'GA' }
{ _id: '30305',
  city: 'ATLANTA',
  loc: [ -84.385145, 33.831963 ],
  pop: 19122,
  state: 'GA' }
{ _id: '30306',
  city: 'ATLANTA',
  loc: [ -84.351418, 33.786027 ],
  pop: 20081,
  state: 'GA' }
{ _id: '30307',
  city: 'ATLANTA',
  loc: [ -84.335957, 33.769138 ],
  pop: 16330,
  state: 'GA' }
{ _id: '30309',
  city: 'ATLANTA',
  loc: [ -84.388338, 33.798407 ],
  pop: 14766,
  state: 'GA' }
{ _id: '30318',
  city: 'ATLANTA',
  loc: [ -84.445432, 33.786454 ],
  pop: 53894,
  state: 'GA' }
{ _id: '30334',
  city: 'ATLANTA',
  loc: [ -84.388188, 33.74715 ],
  pop: 0,
  state: 'GA' }
Type "it" for more
db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"$id"}},{$count:"unique_zipcodes"}])
{ unique_zipcodes: 1 }
db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"city",totalpopulationinAtlanta:{$sum:"pop"}}}])
{ _id: 'city', totalpopulationinAtlanta: 0 }
db.zipcodes.aggregate([{$group:{_id:"$state",statewisepopulation:{$sum:"$pop"}}}])
{ _id: 'OH', statewisepopulation: 10846517 }
{ _id: 'IA', statewisepopulation: 2776420 }
{ _id: 'GA', statewisepopulation: 6478216 }
{ _id: 'WI', statewisepopulation: 4891769 }
{ _id: 'IL', statewisepopulation: 11427576 }
{ _id: 'VT', statewisepopulation: 562758 }
{ _id: 'AL', statewisepopulation: 4040587 }
{ _id: 'ND', statewisepopulation: 638272 }
{ _id: 'ID', statewisepopulation: 1006749 }
{ _id: 'NC', statewisepopulation: 6628637 }
{ _id: 'UT', statewisepopulation: 1722850 }
{ _id: 'RI', statewisepopulation: 1003218 }
{ _id: 'MT', statewisepopulation: 798948 }
{ _id: 'LA', statewisepopulation: 4217595 }
{ _id: 'VA', statewisepopulation: 6181479 }
{ _id: 'MS', statewisepopulation: 2573216 }
{ _id: 'NE', statewisepopulation: 1578139 }
{ _id: 'NM', statewisepopulation: 1515069 }
{ _id: 'HI', statewisepopulation: 1108229 }
{ _id: 'ME', statewisepopulation: 1226648 }
Type "it" for more
db.zipcodes.aggregate([{$group:{_id:{city:"$city",state:"$state"},population:{$sum:"$pop"}}},{$sort:{population:-1}}])
{ _id: { city: 'CHICAGO', state: 'IL' }, population: 2452177 }
{ _id: { city: 'BROOKLYN', state: 'NY' }, population: 2300504 }
{ _id: { city: 'LOS ANGELES', state: 'CA' },
  population: 2102295 }
{ _id: { city: 'HOUSTON', state: 'TX' }, population: 2095918 }
{ _id: { city: 'PHILADELPHIA', state: 'PA' },
  population: 1610956 }
{ _id: { city: 'NEW YORK', state: 'NY' }, population: 1476790 }
{ _id: { city: 'BRONX', state: 'NY' }, population: 1209548 }
{ _id: { city: 'SAN DIEGO', state: 'CA' }, population: 1049298 }
{ _id: { city: 'DETROIT', state: 'MI' }, population: 963243 }
{ _id: { city: 'DALLAS', state: 'TX' }, population: 940191 }
{ _id: { city: 'PHOENIX', state: 'AZ' }, population: 890853 }
{ _id: { city: 'MIAMI', state: 'FL' }, population: 825232 }
{ _id: { city: 'SAN JOSE', state: 'CA' }, population: 816653 }
{ _id: { city: 'SAN ANTONIO', state: 'TX' },
  population: 811792 }
{ _id: { city: 'BALTIMORE', state: 'MD' }, population: 733081 }
{ _id: { city: 'SAN FRANCISCO', state: 'CA' },
  population: 723993 }
{ _id: { city: 'MEMPHIS', state: 'TN' }, population: 632837 }
{ _id: { city: 'SACRAMENTO', state: 'CA' }, population: 628279 }
{ _id: { city: 'JACKSONVILLE', state: 'FL' },
  population: 610160 }
{ _id: { city: 'ATLANTA', state: 'GA' }, population: 609591 }

db.zipcodes.aggregate([{$group:{_id:{city:"$city",state:"state"},population:{$sum:"$pop"}}},{$sort:{population:-1}},{$limit:(3)}])
{ _id: { city: 'CHICAGO', state: 'state' },
  population: 2452177 }
{ _id: { city: 'BROOKLYN', state: 'state' },
  population: 2341387 }
{ _id: { city: 'HOUSTON', state: 'state' },
  population: 2123053 }

db.zipcodes.aggregate([{$group:{_id:{state:"$state",city:"$city"},Avgpop:{$avg:"$pop"}}}])
{ _id: { state: 'MN', city: 'NEW PRAGUE' }, Avgpop: 6601 }
{ _id: { state: 'IL', city: 'ROBERTS' }, Avgpop: 617 }
{ _id: { state: 'IL', city: 'BUCKNER' }, Avgpop: 278 }
{ _id: { state: 'TX', city: 'FRANKLIN' }, Avgpop: 4144 }
{ _id: { state: 'WA', city: 'KALAMA' }, Avgpop: 3627 }
{ _id: { state: 'AR', city: 'KINGSLAND' }, Avgpop: 993 }
{ _id: { state: 'NC', city: 'CASAR' }, Avgpop: 1646 }
{ _id: { state: 'NY', city: 'HORSEHEADS' }, Avgpop: 20799 }
{ _id: { state: 'AL', city: 'SALITPA' }, Avgpop: 896 }
{ _id: { state: 'MO', city: 'FESTUS' }, Avgpop: 22497 }
{ _id: { state: 'MO', city: 'MARTINSBURG' }, Avgpop: 644 }
{ _id: { state: 'GA', city: 'WEST POINT' }, Avgpop: 8499 }
{ _id: { state: 'WV', city: 'KANAWHA FALLS' }, Avgpop: 98 }
{ _id: { state: 'KY', city: 'RUSH' }, Avgpop: 1502 }
{ _id: { state: 'OH', city: 'JEFFERSONVILLE' }, Avgpop: 2359 }
{ _id: { state: 'CA', city: 'CHICO' }, Avgpop: 27452 }
{ _id: { state: 'CA', city: 'LA MESA' }, Avgpop: 33240 }
{ _id: { state: 'LA', city: 'BATCHELOR' }, Avgpop: 1864 }
{ _id: { state: 'VT', city: 'DANVILLE' }, Avgpop: 1482 }
{ _id: { state: 'MS', city: 'MC COOL' }, Avgpop: 1438 }