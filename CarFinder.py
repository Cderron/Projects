import json

is_running = True
AllowedVehiclesList = ['Ford F-150', 'Chevrolet Silverado', 'Tesla CyberTruck', 'Toyota Tundra', 'Rivian R1T', 'Ram 1500']
import json

with open('Car_Finder.json', 'w') as f:
    json.dump(AllowedVehiclesList, f)
while is_running:
        print('********************************')
        print('AutoCountry Vehicle Finder v0.4')
        print('********************************')
        print('Please Enter the following number below from the following menu:')
        print('\n1. PRINT all Authorized Vehicles')
        print('2. SEARCH for Authorized Vehicle')
        print('3. ADD Authorized Vehicle')
        print('4. DELETE Authorized Vehicle')
        print('5. Exit')
        print('********************************')
        choice = input()

        if choice == '1':
            print("The AutoCountry sales manager has authorized the purchase and selling of the following vehicles: ")
            for allowed in AllowedVehiclesList:
                print(allowed)
        elif choice == '2':
            response = input("Please Enter the full Vehicle name: ")
            if response in AllowedVehiclesList:
                print(response + " is an authorized vehicle.")
            else:
                  print(response + " is not an authorized vehicle, if you received this in error please check the spelling and try again.")
        elif choice == '3':
             response = input('Please Enter the full Vehicle name you would like to add:')
             print(f'You have added "{response}" as an authorized vehicle')
             AllowedVehiclesList.append(response)
        elif choice == '4':
            response = input('Please Enter the full Vehicle name you would like to REMOVE: ')
            choice = input(f'Are you sure you want to remove "{response}" from the Authorized Vehicles List? ')
            if choice == 'yes':
                 AllowedVehiclesList.remove(response)
                 print(f'You have REMOVED "{response}" as an authorized vehicle')
        elif choice == '5':
            is_running = False
            print('Thank you for using the AutoCountry Vehicle Finder, good-bye!')
            break

