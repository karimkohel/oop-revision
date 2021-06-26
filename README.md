# oop-revision

## Car dealership
make a care dealership system that has the following

### User 
#### Attributes
- name
- age
- id

#### methods
- accessors
---
### Client 
#### Atr
a type of user that has a 
- list of interests
- net worth
- phone number

#### methods
- accessors
---
### Employee
#### Atr
a payable type of user that has
- joined date
- salary
- overtime hours

#### methods
- accessors
- calculate salary (salary = salary + overtime*50)
---
### Manager
is a payable type of employee that has
#### Atr
- assistant of type employee

#### methods
- calculate salary override (salary = salary + overtime*70)
---

### Vehicle
#### atr
- cost
#### methods 
- calculate milage (may differ upon type of vehicle)
---

### Car 
a type of vehicle
#### atr
- max speed
- convertable

#### methods
- none
---
### electric car
this is rechargable

---
### diesel car
#### atr
- tank size
- carbon emmission density %
---

### bike 
a type of vehicle
#### atr 
- tyre sizes
- seatCapacity
---
### race bike
#### atr
- brake system
---
### scooter
a rechargable type of bike
#### atr
- electric motor life exp
---

### rechargable objects
#### atr
- battery size
- recharging rate

#### methods
- calc recharge time
---
### payable objects 
#### methods
- calc salary
---