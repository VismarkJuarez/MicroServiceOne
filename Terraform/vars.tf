variable AWS_ACCESS_KEY {} //leaving it empty because we don't want the value set in this file
variable AWS_SECRET_KEY {} //leaving it empty because we don't want the value set in this file
variable AWS_REGION {
	default = "us-east-1" //setting a default value for the region
}

variable EC2_NAME {
	type = string
	default = "myEC2"
}
