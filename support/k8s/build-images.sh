docker build -t jamsa/sc-registry ../../registry
docker build -t jamsa/sc-config ../../config
docker build -t jamsa/sc-gateway ../../gateway
docker build -t jamsa/sc-zipkin ../../zipkin
docker build -t jamsa/sc-provider ../../provider/service
docker build -t jamsa/sc-consumer ../../consumer/service
docker build -t jamsa/elk ./elk

