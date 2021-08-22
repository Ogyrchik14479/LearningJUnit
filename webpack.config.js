var path = require('path');

module.exports = function(env, argv) {
    const mode = (argv.mode === 'production');
    return {
        mode: argv.mode,
        entry: './src/main/js/App.js',
        devtool: mode ? '' : 'inline-source-map',
        cache: true,
        output: {
            path: __dirname,
            filename: './src/main/resources/static/built/bundle.js'
        },
        module: {
            rules: [
                {
                    test: path.join(__dirname, '.'),
                    exclude: /(node_modules)/,
                    use: [{
                        loader: 'babel-loader',
                        options: {
                            presets: ["@babel/preset-env", "@babel/preset-react"]
                        }
                    }]
                },
                {
                    test: /\.css$/,
                    use: [
                        'style-loader',
                        'css-loader'
                    ]
                },
                {
                    test: /\.(png|svg|jpg|gif|eot|otf|ttf|woff|woff2)$/,
                    use: [
                        {
                            loader: 'url-loader',
                            options: {}
                        }
                    ]
                }
            ]
        }
    }
};