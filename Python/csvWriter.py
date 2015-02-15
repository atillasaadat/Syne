_author_ = 'Abhi Gupta'
#csvWriter.py	- Py27
#Takes data input from LeapMotion API and compiles a .csv file of all the data

#bytes(s, 'UTF-8') (This must be used when writing to a file for Py32)


import csv

def csv_dict_writer(path, fieldnames, data):
	#writes a csv file using DictWriter

	with open(path, "wb") as out_file:
		writer = csv.DictWriter(out_file, delimiter=',', fieldnames = fieldnames)
		writer.writeheader()

		for row in data:
			writer.writerow(row)

if __name__ == '__main__':
	
	data = ["first_name,last_name,city".split(","),
            "Abhi,Gupta,Vancouver".split(","),
            "Jules,Dicki,Lake Nickolasville".split(","),
            "Dedric,Medhurst,Stiedemannberg".split(",")]
    
	my_list = []

	fieldnames = data[0]

	for values in data[1:]:
		inner_dict = dict(zip(fieldnames, values))	#zip returns a tuple of the list
		my_list.append(inner_dict)

	path = "dict_output.csv"

	csv_dict_writer(path, fieldnames, my_list)



__name__ = '__main__'