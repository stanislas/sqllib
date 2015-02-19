(ns sqllib.core
	(:require [clojure.java.jdbc :as j]))

(def db-spec
	{:classname "org.postgresql.Driver"
	 :subprotocol "postgresql"
	 :subname "//ec2-54-221-249-3.compute-1.amazonaws.com:5432/dejpgaluodduui?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory"
	 :user "xyqyipkupquuli"
	 :password "8KFDhKqw-uRxFrEFxLtv51cInK"})

(comment
	(j/query db-spec "CREATE TABLE EVENT (ACCOUNT_ID BIGINT, BOOKING_TIMESTAMP TIMESTAMP(3), AMOUNT DECIMAL);")
	(j/query db-spec ["SELECT * from EVENT"])
	(doseq [account (range 1 10)]
		(doseq [days (range -10 1)]
			(j/insert! db-spec :insert ...))))