curl -k -s --user 'api:key-fc1b979178be00c42abe0e3f7f5eb120'\
 https://api.mailgun.net/v3/sandbox5b800841f49140a3a394c7e5a055a020.mailgun.org/messages\
 -F from='RaWa<mailgun@sandbox5b800841f49140a3a394c7e5a055a020.mailgun.org>'\
 -F to=$1\
 -F subject='AlphaTest'\
 -F text='at http://sl4.eu/memo'
#-F from='RaWa<wasserfuhr@yahoo.com>'
