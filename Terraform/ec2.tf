# Creates an AWS EC2 Instance
resource "aws_instance" "ec2_example" {
	ami = "ami-026b57f3c383c2eec"
	instance_type = "t2.nano"

	tags = {
		Name = var.EC2_NAME
	}
}
