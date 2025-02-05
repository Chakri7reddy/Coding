package main
import "fmt"
func mergeMaps(map1, map2 map[string]string) map[string]map[string]string {
	mergedMap := make(map[string]map[string]string)
	mergedMap["student1"] = map1
	mergedMap["student2"] = map2
	return mergedMap
}
func main() {
	student1Info := map[string]string{
		"name":      "John Doe",
		"course":    "Computer Science",
		"system_id": "123456",
	}
	student2Info := map[string]string{
		"name":      "Jane Smith",
		"course":    "Mechanical Engineering",
		"system_id": "654321",
	}
	mergedStudentInfo := mergeMaps(student1Info, student2Info)
	fmt.Println("Merged Student Information:")
	for student, info := range mergedStudentInfo {
		fmt.Printf("%s:\n", student)
		for key, value := range info {
			fmt.Printf("  %s: %s\n", key, value)
		}
	}
}
