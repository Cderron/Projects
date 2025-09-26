AllowedVehiclesList = ['Ford F-150', 'Chevrolet Silverado', 'Tesla CyberTruck', 'Toyota Tundra', 'Nissan Titan']
Auto = "******************************** \nAutoCountry Vehicle Finder v0.1 \n********************************\nPlease Enter the following number below from the following menu: \n1. PRINT all Authorized Vehicles\n2. SEARCH for Authorized Vehicle \n3. Exit\n********************************"
print(Auto)


if int(input()) == 1:
    print("The AutoCountry sales manager has authorized the purchase and selling of the following vehicles: ")
    for allowed in AllowedVehiclesList:
        print(allowed)
    print(Auto)
elif int(input()) == 2:
    response = input("Please Enter the full Vehicle name: ")
    if response in AllowedVehiclesList:
        print(response + " is an authorized vehicle.")
        print(Auto)
       
    else: 
        print(response + " is not an authorized vehicle, if you received this in error please check the spelling and try again.")
        print(Auto)



elif int(input()) == 3:
    print("Thank you for using the AutoCountry Vehicle Finder, good-bye!")