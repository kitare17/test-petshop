<%-- 
    Document   : chart
    Created on : Mar 22, 2023, 1:35:10 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/pluscharts.css">
        <script src="https://d3js.org/d3.v5.min.js"></script>
        <script src="dist/pluscharts.js"></script>
    </head>
    <body>

        <div class="d-flex">
            <div class="col-md-6" id="column-chart"></div>
            <div class="col-md-6" id="spline-chart"></div>
        </div>
        <script>
            pluscharts.draw({
                drawOn: '#column-chart',
                type: "column",
                dataset: {
                    data: [
                        {
                            label: "Jan",
                            value: ${100}
                        },
                        {
                            label: "Feb",
                            value: 50
                        },
                        {
                            label: "Mar",
                            value: 60
                        },
                        {
                            label: "Apr",
                            value: 70
                        },
                        {
                            label: "May",
                            value: 80
                        }
                    ],
                    backgroundColor: "#5d62b4", //can be array or single color
                    borderColor: "#5d62b4",
                    borderWidth: 0,
                    legendLabel: "Registers"
                },
                options: {
                    barPadding: .65,
                    barWidth: 15,
                    text: {
                        display: false,
                        color: "#6c478c"
                    },
                    axes: {
                        x: {
                            display: true,
                            min: 0,
                            max: 100
                        },
                        y: {
                            display: true,
                            min: 0,
                            max: 100
                        }
                    },
                    legends: {
                        display: true,
                        width: 20,
                        height: 20
                    },
                    size: {
                        width: '400', //give 'container' if you want width and height of initiated container
                        height: '400'
                    }
                }
            });


            pluscharts.draw({
                drawOn: "#spline-chart",
                type: "spline",
                dataset: {
                    data: [
                        {
                            label: 10,
                            value: 20
                        },
                        {
                            label: 20,
                            value: 50
                        },
                        {
                            label: 30,
                            value: 30
                        },
                        {
                            label: 40,
                            value: 10
                        },
                        {
                            label: 50,
                            value: 100
                        },
                        {
                            label: 60,
                            value: 60
                        },
                        {
                            label: 70,
                            value: 80
                        },
                        {
                            label: 80,
                            value: 50
                        },
                        {
                            label: 100,
                            value: 70
                        }
                    ],
                    lineColor: "#ef5958",
                    lineWidth: 2,
                    legendLabel: "visitors"
                },
                options: {
                    text: {
                        display: false,
                        color: "#6c478c"
                    },
                    points: {
                        display: true,
                        radius: 3
                    },
                    axes: {
                        x: {
                            display: true,
                            scale: 3,
                            min: 0,
                            max: 100
                        },
                        y: {
                            display: true,
                            scale: 3,
                            min: 0,
                            max: 100
                        }
                    },
                    legends: {
                        display: true,
                        width: 20,
                        height: 20
                    },
                    size: {
                        width: '400', //give 'container' if you want width and height of initiated container
                        height: '400'
                    }
                }
            })

        </script>
    </body>
</html>
