GET - localhost:8080/hotels/all

GET - localhost:8080/hotels/5f99b7ed5d07d40656c196cd

POST - localhost:8080/hotels
{
    "name": "Hilton",
    "pricePerNight": 200,
    "address": {
        "city": "Istanbul",
        "country": "Turkey"
    },
    "reviews": [
        {
            "userName": "Ali",
            "rating": 8,
            "approved": false
        }
    ]
}


GET - localhost:8080/hotels/price/100

GET - localhost:8080/hotels/address/Paris